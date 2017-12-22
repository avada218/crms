package xmu.crms.entity;

import java.math.BigInteger;
/**
 *
 * @author DatabaseStandardGroup
 * @date 2017/12/22
 */
public class FixGroup {
	private BigInteger id;
	private ClassInfo classInfo;
	private User leader;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public ClassInfo getClassInfo() {
		return classInfo;
	}
	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}
	public User getLeader() {
		return leader;
	}
	public void setLeader(User leader) {
		this.leader = leader;
	}
	
}
