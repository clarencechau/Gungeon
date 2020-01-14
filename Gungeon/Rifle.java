import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rifle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rifle extends Weapon
{
    private GreenfootImage gun = new GreenfootImage("Rifle.png");
    public Rifle(ItemInfo itemInfo, Player player,int damage, int bulletSpeed, long fireRate, long bulletReadyTime, long reloadTime, int magSize)
    {
        super(itemInfo,player,damage, bulletSpeed, fireRate, bulletReadyTime, reloadTime, magSize);
        gun.scale(gun.getWidth()*150/100,gun.getHeight()*150/100);
        setImage(gun);
    }
    protected Ammunition createBullet()
    {
        this.mouseX = Greenfoot.getMouseInfo().getX();
        this.mouseY = Greenfoot.getMouseInfo().getY();
        if(ammoInMag<=10) player.reduceAmmo();
        itemInfo.updateAmmo();
        return new RifleBullet(mouseX, mouseY,bulletDamage, bulletSpeed);
    }
}
