package com.nt.git;

import com.nt.add.Addition;
import com.nt.big.BigNumber;
import com.nt.sub.Substraction;

public class GitHubTLTest {

	public static void main(String[] args) {
		System.out.println("welcome to git1 create to TL");
		System.out.println("welcome to git2");
		System.out.println("Welcome to git3--->through TL");
		System.out.println("Welcome to git4--->through Dev1");
		System.out.println("Welcome to git5-->again changes through Dev1");
		System.out.println("welcome to git6-->through TL");
		System.out.println("Welcome to git7 after coming Dev2--->through TL");
		BigNumber bn = new BigNumber();
		System.out.println("Bignumber:"+bn.bigDigit(49, 100));
		Substraction substraction = new Substraction();
		System.out.println("Sub:"+substraction.sub(150, 40));
		System.out.println("without fetch, and pull Dev2 perform commit operation ");
		Addition addition = new Addition();
		System.out.println("add"+addition.add(40, 50));
		System.out.println("again confilcts: tl"); 
		System.out.println("abount sub branches");
	}

}
