
class Computer
{
    public void playMusic()
    {
        System.out.println("music playing");

    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
            return "pen";
        else
            return "nothing";
    }
}

public class Demo03
{
    public static void main(String[] args) {
        
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(2);
        System.out.println(str);

    }
}