/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainerprogram;

/**
 *
 * @author joshu
 */
public class Trainer {
    private String name;
    private String schedule;
    private String shift;
    private String expertise;
    private int idNum;
    private String trainType;
    private String hall;
    public Trainer(){
        
    }
    
    public Trainer(String name, String schedule, String shift, String expertise, int idNum, String trainType, String hall){
        this.name = name;
        this.schedule = schedule;
        this.shift = shift;
        this.expertise  = expertise;
        this.idNum = idNum;
        this.trainType = trainType;
        this.hall = hall;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setSchedule(String newSchedule){
        schedule = newSchedule;
    }
    
    public void setShift(String newShift){
        shift = newShift;
    }
    
    public void setExpertise(String newExpertise){
        expertise = newExpertise;
    }
    
    public void setIdNum(int newIdNum){
        idNum = newIdNum;
    }
    
    public void setTrainType(String newTrainType){
        trainType = newTrainType;
    }
    
    public void setHall(String newHall){
        hall = newHall;
    }
    
     public String getName(){
        return name;
    }
    
    public String getSchedule(){
        return schedule;
    }
    
    public String getShift(){
       return shift;
    }
    
    public String getExpertise(){
       return expertise;
    }
    
    public int getIdNum(){
        return idNum;
    }
    
    public String getTrainType(){
       return trainType;
    }
    
    public String Hall(){
        return hall;
    }
    
}