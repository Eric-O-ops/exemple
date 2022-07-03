public class Main {
    public static void main(String[] args) {
        
        Weapon ak_103 = new Weapon();
        ak_103.setTypeWeapon("Assault rifle ");
        ak_103.setNameWeapon("ak-103");

        Boss boss = new Boss();
        boss.setHealth(300);
        boss.setDamage(40);
        boss.setProtect("Fire");
        boss.setWeapon(ak_103);

        System.out.println(   "Health: [" + boss.getHealth() + "]\nDamage: [" + boss.getDamage() +
        "]\nProtect: [" + boss.getProtect()  + "]\nWeapon type: [" + boss.getWeapon().getTypeWeapon() + "]" +
                " and name: [" + boss.getWeapon().getNameWeapon() + "]"

        );








    }
}