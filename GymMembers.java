
public class GymMembers {
    private String name;
    private int tier;
    private int startDate;
    private int endDate;

    /**
     * Default GymMembers constructor
     */
    public GymMembers(){
        
    }
    /**
     * 
     * @param name Name of the member
     * @param tier Membership tier of the member
     * @param startDate Membership start date
     * @param endDate Membership end date
     */
    public GymMembers(String name, int tier, int startDate, int endDate){
        this.name = name;
        this.tier = tier;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    /**
     * 
     * @param name Sets a new name.
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * 
     * @param tier Sets the Membership tier
     */
    public void setTier(int tier){
        this.tier = tier;
    }
    /**
     * 
     * @param startDate Sets the start date of the member
     */
    public void setStartDate(int startDate){
        this.startDate = startDate;
    }
    /**
     * 
     * @param endDate Sets the end date of the member
     */
    public void setEndDate(int endDate){
        this.endDate = endDate;
    }
    /**
     * 
     * @return the name of the member
     */
    public String getName(){
        return name;
    }
    /**
     * 
     * @return the tier of the member
     */
    public int getTier(){
        return tier;
    }
    /**
     * 
     * @return the members start date
     */
    public int getStartDate(){
        return startDate;
    }
    /**
     * 
     * @return the members end date
     */
    public int getEndDate(){
        return endDate;
    }
     @Override
    public String toString(){
        return String.format("Member Name: " + name + " | Member tier: " + tier + " | Start Date: " + startDate + " | End Datet: " + endDate + "\n");
    }
}
