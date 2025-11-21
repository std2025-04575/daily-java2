package day05.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * IDを入力するクラス
 */

public class ConsoleReader {
	int inputId() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int id = Integer.parseInt(br.readLine());

		return id;
	}

}
