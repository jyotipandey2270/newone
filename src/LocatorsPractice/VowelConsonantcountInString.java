package LocatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VowelConsonantcountInString {

	public static void main(String[] args) {
		
		String name= "jyoti";
		int vowel=0;
		int conso=0;
		name=name.toLowerCase();
		
		char[] arr= name.toCharArray();
		
		for(char c:arr)
		{
			
			if(c!=' ')
			{
				
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					
					vowel++;
					
				}
				else
				{
					
					conso++;
				}
			}
			
			
		}
		
		System.out.println("all vowel present in words:"+vowel);
		System.out.println("all vowel present in words:"+conso);
        
        
        
		
		

	}

}
