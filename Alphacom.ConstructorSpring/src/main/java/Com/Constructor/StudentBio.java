package Com.Constructor;

import java.util.*;

public class StudentBio {

	public StudentBio(int stud_id, List<String> parents, List<String> subjects, Map<String, String> sub_marks,
			Set<String> phones) {
		super();
		Stud_id = stud_id;
		this.parents = parents;
		this.subjects = subjects;
		Sub_marks = sub_marks;
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "StudentBio [Stud_id=" + Stud_id + ", parents=" + parents + ", subjects=" + subjects + ", Sub_marks="
				+ Sub_marks + ", phones=" + phones + "]";
	}
	private int Stud_id;
	private List<String> parents;
	private List<String> subjects;
	private Map<String, String> Sub_marks;
	private Set<String> phones;
}
