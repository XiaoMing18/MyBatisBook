package com.huangchen.domain;
/**
 * ����class���Ӧ��ʵ���
 * @author huangchen
 *
 */
public class Classes {
	//����ʵ��������ԣ���class���е��ֶζ�Ӧ
	private int id;//id == > c_id
	private String name;//name == >c_name
    private Teacher teacher;
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	/**
	 * class������һ��teacher_id�ֶΣ�������Classes���ж���һ��teacher����
	 * ����ά��teacher��classes֮���һ��һ��ϵ��ͨ�����teacher���ԾͿ���֪������༶�����ĸ���ʦ�����
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Classes [id=" + id + ", name=" + name + ", teacher=" + teacher + ", getTeacher()=" + getTeacher()
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
