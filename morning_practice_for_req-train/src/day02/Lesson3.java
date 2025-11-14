//追加問題

//パッケージ名 day02
//クラス名 Lesson3.java

//3つの任意の整数をコンソールから入力し、税込み金額（消費税は8％計算）の合計を出しなさい。
//また、平均金額を求めなさい。
//キャストしてすべて整数値で求めること。
//【出力例】
//金額①を入力してください>>210
//金額②を入力してください>>300
//金額③を入力してください>>350
//①から③の合計は税込み928円
//①から③の平均は税込み309円

package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson3 {

	public static void main(String[] args) throws IOException {

		int sum =0;// 合計金額
		int average =0;// 平均金額
		int inputCount =0;//入力した回数

		/*ここから記入*/
		System.out.println("金額①を入力してください。");
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String str1=reader.readLine();
		inputCount++;
		
		System.out.println("金額②を入力してください。");
		String str2=reader.readLine();
		inputCount++;
		
		System.out.println("金額③を入力してください。");
		String str3=reader.readLine();
		inputCount++;
		
		double dnum1=Double.parseDouble(str1);
		double dnum2=Double.parseDouble(str2);
		double dnum3=Double.parseDouble(str3);
		
		double dsum;
		dsum=(dnum1+dnum2+dnum3)*1.08;
		sum=(int)dsum;
		
		average=sum/inputCount;
		
		System.out.println("①から③の合計は税込み"+sum+'円');
		System.out.println("①から③の平均は税込み"+average+'円');

	}

}
