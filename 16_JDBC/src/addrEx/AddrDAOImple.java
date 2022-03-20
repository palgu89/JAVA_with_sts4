package addrEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddrDAOImple implements DataAccessObject {
	private Connection conn;
	// connection 한 상태에서 명령을 내릴 때 pst가 데이터를 담는 순간부터 실행돼서 어떤 결과가 나오는지까지, 데이터를 담아서 데이터베이스에서 가져오는 것까지 담당
	private PreparedStatement pst;
	private String query = "";	// 이제 추가할 목록들
	
	
	public AddrDAOImple() {
		DataBaseConnect dbc = DataBaseConnect.getInstance();
		conn = dbc.getConnection();
	}
	
	@Override
	public int insert(Address addr) {
		query = "insert into addr values(?, ?, ?);";	// ""안의 ;는 cmd에선 써줬어야 했지만 여기선 안써도 됨
		// (name, tel, age)이지만 우리가 입력 받은 걸 넣어야 하므로 와일드카드 (?) 를 사용한다
		try {
			pst = conn.prepareStatement(query);	// 완성형 qurey면 바로 db로 실행시키면 되는데 아니기 때문에 preparedStatement로 셋팅 후 작업
			pst.setString(1, addr.getName());	// ()안은 인덱스, 값인데 인덱스는 자바 인덱스가 아니라 db 인덱스 -> db인덱스는 1부터 시작(row col 개념이기 때문)
			pst.setString(2, addr.getTel());
			pst.setInt(3, addr.getAge());
			return pst.executeUpdate();	// db의 상태를 변화시키면 executeUpdate()
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public List<Address> selectList() {
		query = "select * from addr order by age desc";	// order by age desc(asc) 를 붙이면 나이 역순(순서)대로 출력
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			List<Address> list = new ArrayList<>();
			while (rs.next()) {
				list.add(new Address(rs.getString("name"), rs.getString("tel"), rs.getInt("age")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public Address selectOne(String name) {
		query = "select * from addr where name = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();	// ResultSet: cmd의 table 모양대로 가져다 줌
			if (rs.next()) {
//				String n = rs.getString("name");
//				String t = rs.getString("tel");
//				int a = rs.getInt("age");
//				return new Address(n, t, a);
				return new Address(rs.getString("name"), rs.getString("tel"), rs.getInt("age"));
			}	// if문을 한번만 돌리기 때문에 중복되는 이름이 있어도 하나만 출력 된다 -> while문으로 돌려 모두 출력하려면 선택되는 것들을 담을 리스트 필요
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Address selectOneByTel(String tel) {
		query = "select * from addr where tel = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, tel);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return new Address(rs.getString("name"), rs.getString("tel"), rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@Override
	public List<Address> selectListByAge(int age) {
		query = "select * from addr where age = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, age);
			ResultSet rs = pst.executeQuery();
			List<Address> list = new ArrayList<>();
			while (rs.next()) {
				list.add(new Address(rs.getString("name"), rs.getString("tel"), rs.getInt("age")));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public int update(Address addr) {
		query = "update addr set tel = ?, age = ? where name = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, addr.getTel());
			pst.setInt(2, addr.getAge());
			pst.setString(3, addr.getName());
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return 0;
	}

	@Override
	public int delete(String name) {
		query = "delete from addr where name= ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, name);
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}


}
