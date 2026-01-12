package loanbuddy;

public class Application {
	private String name;
	private int creditScore;
	private int income;     
	private int loadAmount;
	
	
	public Application(String name, int creditScore, int income, int loadAmount) {
		this.name = name;
		this.creditScore = creditScore;
		this.income = income;
		this.loadAmount = loadAmount;
	}
	
	public String getName() {
        return name;
    }

	
	protected int getCreditScore() {
		return creditScore;
	}

	protected int getIncome() {
		return income;
	}

	protected int getLoadAmount() {
		return loadAmount;
	}

}


