/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainerprogram;

/**
 *
 * @author joshu
 * Trainer class
 */
public class Trainer {
    private String name;
    private String trainType;
    private String hall;
    
    /**
     * Default Trainer constructor
     */
    public Trainer(){
        
    }
    
    /**
     * 
     * @param name : Name of the trainer
     * @param trainType : THe type of training the Trainer teaches
     * @param hall : The hall the Trainer works in
     */
    public Trainer(String name, String trainType, String hall){
        this.name = name;
        this.trainType = trainType;
        this.hall = hall;
    }
    
    /**
     * Setter for the Trainer's name
     * @param newName the new name for the trainer, what the name will become.
     */
    public void setName(String newName){
        name = newName;
    }
    
   /**
    * Setter for the trainType
    * @param newTrainType new train type for the Trainer, what the TrainType will become
    */
    public void setTrainType(String newTrainType){
        trainType = newTrainType;
    }
    
    /**
     * Setter for the Trainer's hall
     * @param newHall new hall for the Trainer, what their hall name will become
     */
    public void setHall(String newHall){
        hall = newHall;
    }
    
    /**
     * Getter for the Trainer's name
     * @return the name
     */
     public String getName(){
        return name;
    }
    
     /**
      * Getter for trainType
      * @return current trainType
      */
    public String getTrainType(){
       return trainType;
    }
    /**
     * Getter for the hall var
     * @return current hall
     */
    public String Hall(){
        return hall;
    }
    
}