package controller;

import dao.SkillDAO;

public class Main{
	public static void main(String[]args) {
		SkillDAO skill = new SkillDAO();
		SkillDAO skilldao;
		ArrayList<Skill>  list= (ArrayList<Skill>) skilldao.listAllSkills();
		System.out.println("List of skills");
		for(Skill s: list)
		{
			System.out.println(s.getSkillId()+"  "+s.getSkillName());
		}
	}
}
