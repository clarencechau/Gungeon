import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class PistolEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletEnemy extends Enemy
{
    // Need to use array list of images later
    private static GreenfootImage BulletEnemyImage;;
    private static int imageX;
    private static int imageY;
    public BulletEnemy(int health, int bulletWidth)
    {
        //BulletEnemyImage.scale(imageX, imageY);
        //setImage(BulletEnemyImage);        
        healthPoints = health;     
        this.bulletWidth = bulletWidth;
    }
    
    public void addedToWorld()
    {
        foundPlayers = new ArrayList<Player>(getWorld().getObjects(Player.class));
        player = foundPlayers.get(0);
    }
    
    public void act() 
    {
        moveTowardsPlayer();       
    }    
 
    
    public void attack()
    {
        //getWorld().addObject(new PistolBullet(player, 1), getX(), getY());   
        
    }
