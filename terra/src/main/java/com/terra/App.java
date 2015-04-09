package com.terra;

import java.io.IOException;
import java.net.ServerSocket;

import javax.swing.JOptionPane;

import com.view.vmain;

/**
 * Hello world!
 *
 */
public class App {
	private static ServerSocket srvSocket = null;
	private static final int srvPort = 12345; // 防止重複開啟

	public static void main(String[] args) {
		checkwindows();
		vmain app = new vmain();
	}

	private static void checkwindows() {
		try {
			srvSocket = new ServerSocket(srvPort);
		} catch (IOException e) {
			if (e.getMessage().indexOf("Address already in use: JVM_Bind") >= 0) {
				JOptionPane.showMessageDialog(null, "該程式已啟動", "提示",
						JOptionPane.OK_OPTION);
				System.exit(0);

			}
			e.printStackTrace();
		}
	}
}
