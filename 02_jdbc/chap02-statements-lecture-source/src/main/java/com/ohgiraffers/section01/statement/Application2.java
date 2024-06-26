package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application2 {

    public static void main(String[] args) {

        /* 1. Connection 생성 */
        Connection con = getConnection();

        /* 2. Statement 선언 */
        Statement stmt = null;

        /* 3. ResultSet 선언 */
        ResultSet rset = null;

        try {

            /* 4. Connection의 createStatement()를 이용한 Statement 인스턴스 생성 */
            stmt = con.createStatement();

            Scanner sc = new Scanner(System.in);
            System.out.print("조회하실 사번을 입력해주세요 : ");
            String empId = sc.nextLine();

            String query = "SELECT EMP_ID, EMP_NAME FROM EMPLOYEE WHERE EMP_ID = '" + empId + "'" ;

            System.out.println("query = " + query);

            /* 5. excuteQuery()로 쿼리문 실행 후 결과를 ResultSet으로 반환 받음 */
            rset = stmt.executeQuery(query);

            
            /* 6. ResultSet에 담긴 결과물을 컬럼명을 이용해 꺼내어 출력 */
            /* 반환한 결과집합의 값이 1개의 로우 밖에 없을 것이라 확신할 경우에는 if 구문을 쓸 수도 있음*/
            if (rset.next()) {
                System.out.println(rset.getString("EMP_ID") + ", " + rset.getString("EMP_NAME"));
                
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            /* 7. 사용한 자원 반납 */
            close(rset);
            close(stmt);
            close(con);
        }
    }
}
