package com.wyc.Exam_12709_20161209_3;

import java.util.Scanner;

public class App 
{
	 public static void main(String args[]){
		    int sum = 0;
		    boolean leap = false;
		    boolean b = false;
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("请输入日期，以-隔开：");
		    String[] str = scanner.next().split("-");//分割字符串
		    int year = Integer.parseInt(str[0]);//拿出年份的字符串并转换为Int型
		
		    //判断是否为闰年
		    if(year % 4 == 0 && year % 100 != 0 ||year % 400 == 0)
		      {leap = true;}
		    int month =  Integer.parseInt(str[1]);//拿出月份的字符串并转换为Int型
		    switch(month){
		      case 2 : sum = 31;break;//计数器
		      case 3 : sum = 59;break;
		      case 4 : sum = 90;break;
		      case 5 : sum = 120;break;
		      case 6 : sum = 151;break;
		      case 7 : sum = 181;break;
		      case 8 : sum = 212;break;
		      case 9 : sum = 243;break;
		      case 10 : sum = 273;break;
		      case 11 : sum = 304;break;
		      case 12 : sum = 334;break;
		    }
		    int day =  Integer.parseInt(str[2]);//拿出日期的字符串并转换为Int型
		    sum += day;
		    if(leap )
		      {++sum;}
		    System.out.println("您输入的日期是该年第" + sum + "天");
		  }
}

