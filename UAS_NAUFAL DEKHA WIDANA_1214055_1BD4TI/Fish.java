import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        kontrol();
        data();
    }
    public void data(){
    try{
        String sql = "SELECT * FROM dbgreenfoot";
        java.sql.Connection conn = (Connection);
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet res = stm.executeQuery(sql);
        while(res.next()){
            res.getString("kunci database:"+res.getString(1));
        }
    }catch(Exception e){
    }
    }
    
    public void kontrol(){
        if(Greenfoot.isKeyDown("d")){
            move(5);
        }
        
        if(Greenfoot.isKeyDown("a")){
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY()+5);
        }
        
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX(),getY()-5);
        }
    }
}
