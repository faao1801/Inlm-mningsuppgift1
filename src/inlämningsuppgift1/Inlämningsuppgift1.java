/*
*Program som visar hur mycket varje djur behöver födas beroende på vikten
 * Java Utveckling 18
 */

package inlämningsuppgift1;

import javax.swing.JOptionPane;


public class Inlämningsuppgift1 {
    Inlämningsuppgift1(){
    //skapa djur objekt med deras namn och vikt som parameteer i konstruktorn
    Hund sixten= new Hund("Sixten",5000);
    Hund dogge=new Hund("Dogge",10000);
    Katt venus=new Katt("Venus",5000);
    Katt ove=new Katt("Ove",3000);
    Orm hypno=new Orm("Hypno",1000);
    //skapar foder bjekt med fodernamn och totalvikt som parameter i konstruktorn
    HundFoder hundFoder=new HundFoder("hundfoder",1010);
    KattFoder kattFoder=new KattFoder("kattfoder",1010);
    Ormpellets ormpellet=new Ormpellets("ormpellets",1000);
   
    double r;
    int i;
    String s;
    
    while(true){
        try{
            //frågar användaren att ange djurens namn
            String namn=JOptionPane.showInputDialog("Vilket djur ska få mat?");
            //om användaren matar in tomt sträng aller trycker på avbryt så stängs programmet
            if(namn==null||namn.equals(""))
                System.exit(0);
            
            switch (namn) {
                case "Sixten":
                case "Dogge":
                    {
                        r=(namn.equalsIgnoreCase("sixten")?sixten:dogge).räkna(hundFoder);
                        JOptionPane.showMessageDialog(null,"hunden "+(namn.equals("Sixten")?"Sixten":"Dogge")+" ska få "+r+" gram av "+hundFoder.getFoderTyp());
                        if(hundFoder.getWeight()<1000){
                             i=JOptionPane.showConfirmDialog(null,"Det är för lågt kantitet hundfoder kvar (mindre än 1000g) vill du beställa mer?","Beställning",JOptionPane.YES_NO_OPTION);
                             if(i==0){
                                 s=JOptionPane.showInputDialog("hur mycket vill du beställa i gram ?");
                                 if(s==null||s.equals(""))
                                     break;
                                 hundFoder.beställFoder(Double.parseDouble(s));
                                 JOptionPane.showMessageDialog(null,"Du har totalt just nu: "+hundFoder.getWeight()+" gram "+hundFoder.getFoderTyp());
                                }
                             else if(i==1||i==2||i==-1)
                             JOptionPane.showMessageDialog(null,"Du har kvar: "+hundFoder.getWeight()+" gram "+hundFoder.getFoderTyp());
                        }
                        else
                            break;
                        break;
                    }
                case "Venus":
                case "Ove":
                    {
                        r=(namn.equalsIgnoreCase("Venus")?venus:ove).räkna(kattFoder);
                        JOptionPane.showMessageDialog(null,"katten "+(namn.equals("Venus")?"Venus":"Ove")+" ska få "+r+" gram av "+kattFoder.getFoderTyp());
                         if(kattFoder.getWeight()<1000){
                             i=JOptionPane.showConfirmDialog(null,"Det är för lågt kantitet kattfoder kvar (mindre än 1000g) vill du beställa mer?","Beställning",JOptionPane.YES_NO_OPTION);
                             if(i==0){
                                 s=JOptionPane.showInputDialog("hur mycket vill du beställa i gram ?");
                                 if(s==null||s.equals(""))
                                     break;
                                 kattFoder.beställFoder(Double.parseDouble(s));
                                 JOptionPane.showMessageDialog(null,"Du har totalt just nu: "+kattFoder.getWeight()+" gram "+kattFoder.getFoderTyp());
                                }
                             else if(i==1||i==2||i==-1)
                             JOptionPane.showMessageDialog(null,"Du har kvar: "+kattFoder.getWeight()+" gram "+kattFoder.getFoderTyp());
                        }
                        else
                            break;
                        break;
                    }
                case "Hypno":
                    {
                        r=hypno.räkna(ormpellet);
                        JOptionPane.showMessageDialog(null,"ormen "+hypno.getName()+" ska få "+r+" gram av "+ormpellet.getFoderTyp());
                         if(ormpellet.getWeight()<1000){
                             i=JOptionPane.showConfirmDialog(null,"Det är för lågt kantitet ormpellets kvar (mindre än 1000g) vill du beställa mer?","Beställning",JOptionPane.YES_NO_OPTION);
                             if(i==0){
                                 s=JOptionPane.showInputDialog("hur mycket vill du beställa i gram ?");
                                 if(s==null||s.equals(""))
                                     break;
                                 ormpellet.beställFoder(Double.parseDouble(s));
                                 JOptionPane.showMessageDialog(null,"Du har totalt just nu: "+ormpellet.getWeight()+" gram "+ormpellet.getFoderTyp());
                                }
                             else if(i==1||i==2||i==-1)
                             JOptionPane.showMessageDialog(null,"Du har kvar: "+ormpellet.getWeight()+" gram "+ormpellet.getFoderTyp());
                        }
                        else
                            break;
                        break;
                    }
                default:


                    break;
            }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Fel inmatning ","Fel",JOptionPane.ERROR_MESSAGE);
        }
            
    }
             
      
    
        }

    public static void main(String[] args) {
        Inlämningsuppgift1 inlämning1=new Inlämningsuppgift1();
    }

}
