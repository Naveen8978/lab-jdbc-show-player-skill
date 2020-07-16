package dao;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import model.skill;
import utility.ConnectionManager;

public class SkillDAO
{
	static List<SkillDAO> list=new ArrayList<SkillDAO>();
	public List< SkillDAO > listAllSkills() throws Exception
	{
        Connection con = ConnectionManager.getConnection();
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("SELECT * FROM SKILL ORDER BY name");
		while(rs.next())
		{
			long id=rs.getLong(1);
			String name=rs.getString(2);
			Object skill=new skill(id,name);
			list.addAll((Collection<? extends SkillDAO>) skill);
		}

		return list;
	
	}	
}
