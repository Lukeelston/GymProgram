
public class GymMembers {
    private String name;
    private int tier;
    private int startDate;
    private int endDate;

    public GymMembers(){
        
    }
    public GymMembers(String name, int tier, int startDate, int endDate){
        this.name = name;
        this.tier = tier;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setTier(int tier){
        this.tier = tier;
    }
    
    public void setStartDate(int startDate){
        this.startDate = startDate;
    }
    
    public void setEndDate(int endDate){
        this.endDate = endDate;
    }
    
    public String getName(){
        return name;
    }
    
    public int getTier(){
        return tier;
    }
    
    public int getStartDate(){
        return startDate;
    }
    
    public int getEndDate(){
        return endDate;
    }
}
