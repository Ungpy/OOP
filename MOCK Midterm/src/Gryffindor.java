
public class Gryffindor extends Houses implements Magicable{
    public Gryffindor(){
        super("Gryffindor", "RED");
    }
    public void attackSpell(Player player, Player target, Spell spell){
        target.setHp(target.getHp()-player.getAttackDamage()-spell.getDamage());
        if(spell.getName().equals("Incendio")){
            player.setMana(player.getMana()-4);
        }
        else if(spell.getName().equals("Expelliarmus")){
            player.setMana(player.getMana()-3);
        }
        System.out.println(player.getName() +": use spell (" + spell.getName() +")");
    }
    public void defense(Player player, Player damager){
        player.setHp(player.getHp() + 3 );
        player.setMana(player.getMana() + 4 );
        System.out.println(player.getName() + ": Episkey !");
    }
}
