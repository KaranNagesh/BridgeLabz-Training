package com.map.votingsystem;

import java.util.*;

//Voting System implementation
class VotingSystem {

	// Stores votes (Candidate → Vote Count)
	private HashMap<String, Integer> voteMap = new HashMap<>();

	// Maintains insertion order of votes
	private LinkedHashMap<String, Integer> voteOrderMap = new LinkedHashMap<>();

	// Cast a vote for a candidate
	public void castVote(String candidate) {

		// Update HashMap (fast lookup)
		voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);

		// Update LinkedHashMap (maintains order)
		voteOrderMap.put(candidate, voteMap.get(candidate));
	}

	// Display votes in insertion order
	public void displayVoteOrder() {
		System.out.println("\nVotes in Insertion Order:");
		for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
			System.out.println(entry.getKey() + " → " + entry.getValue());
		}
	}

	// Display votes sorted alphabetically by candidate
	public void displaySortedResults() {
		System.out.println("\nSorted Election Results:");

		TreeMap<String, Integer> sortedMap = new TreeMap<>(voteMap);

		for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + " → " + entry.getValue());
		}
	}

	// Display winner
	public void displayWinner() {
		String winner = null;
		int maxVotes = Integer.MIN_VALUE;

		for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
			if (entry.getValue() > maxVotes) {
				maxVotes = entry.getValue();
				winner = entry.getKey();
			}
		}

		System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes");
	}
}