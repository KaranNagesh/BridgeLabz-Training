package com.map.votingsystem;


public class VotingApp {

	public static void main(String[] args) {

		VotingSystem system = new VotingSystem();

		// Casting votes
		system.castVote("Alice");
		system.castVote("Bob");
		system.castVote("Alice");
		system.castVote("Carol");
		system.castVote("Bob");
		system.castVote("Alice");

		// Display results
		system.displayVoteOrder();
		system.displaySortedResults();
		system.displayWinner();
	}
}