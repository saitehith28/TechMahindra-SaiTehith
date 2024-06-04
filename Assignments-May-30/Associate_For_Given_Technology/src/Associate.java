public class Associate {
	public int id;
	public String name;
	public String technology;
	public int experienceInYears;
	Associate(){}
	public Associate(int id,String name,String technology,int experienceInYears){
		this.id=id;
		this.name=name;
		this.technology=technology;
		this.experienceInYears=experienceInYears;
	}
	public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getTechnology() {
        return technology;
    }
    public int getExperienceInYears() {
        return experienceInYears;
    }
}
