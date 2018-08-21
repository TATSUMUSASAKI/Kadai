package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.KakeiboDto;

	public class KakeiboDao {
		public static KakeiboDto add(String key,String key1, String key2){
			KakeiboDto result = new KakeiboDto();

				Connection con = null;
				PreparedStatement pstmt = null;
				int rs = 0;

				try {
					// ②JDBCドライバをロードする
					Class.forName("com.mysql.jdbc.Driver");

					// ③DBMSとの接続を確立する
					con = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/kadaidb?useSSL=false",
							"usertatsu",
							"3216");
					// ④SQL文を作成する
					String sql = "Insert into  kakeibo(syunyu,shisyutsu,riyoubi) values(?,?,?);";
					// ⑤SQL文を実行するための準備を行う
					pstmt = con.prepareStatement(sql);

					int i = Integer.parseInt(key);
					pstmt.setInt(1, i);
					pstmt.setString(2, key1);
					pstmt.setString(3, key2);


					// ⑥SQL文を実行してDBMSから結果を受信する
					pstmt.executeUpdate();


				} catch (ClassNotFoundException e) {
					System.out.println("JDBCドライバが見つかりません。");
					e.printStackTrace();
				} catch (SQLException e) {
					System.out.println("DBアクセス時にエラーが発生しました。");
					e.printStackTrace();
				} finally {
					// ⑧DBMSから切断する
					try {
						if (pstmt != null) {
							pstmt.close();
						}
					} catch (SQLException e) {
						System.out.println("DBアクセス時にエラーが発生しました。");
						e.printStackTrace();
					}
					try {
						if (pstmt != null) {
							pstmt.close();
						}
					} catch (SQLException e) {
						System.out.println("DBアクセス時にエラーが発生しました。");
						e.printStackTrace();
					}
					try {
						if (con != null) {
							con.close();
						}
					} catch (SQLException e) {
						System.out.println("DBアクセス時にエラーが発生しました。");
						e.printStackTrace();
					}
				}
				return result;
			}

	}



