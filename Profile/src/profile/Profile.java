package profile;
import java.io.*;
public class Profile
{
    protected static int detailscheck(String pass,String repass,String usid)
    {
        File f=new File(".\\"+usid+".txt");
        if(!pass.equals(repass))
        {return 2;}
        else if(f.exists())
        {return 3;}
        else
        {
            for(int i=0;i<usid.length();i++)
            {
                if(((int)usid.charAt(i)>=65&&(int)usid.charAt(i)<=90)){}
                else if(((int)usid.charAt(i)>=97)&&((int)usid.charAt(i)<=122)){}
                else if(((int)usid.charAt(i)>=48&&(int)usid.charAt(i)<=57)){}
                else if(((int)usid.charAt(i)==95)){}
                else{return 1;}
            }
        }
        return 10;
    }
    protected static void createacc(String ftnm,String ltnm,String gndr,String emid,String mbno,String usid,String adrs,String pass,String repass) throws IOException
    {
        
        File f=new File(".\\fck.txt");
        if(f.exists())
        {
            FileWriter out = new FileWriter(f,true);
            BufferedWriter w = new BufferedWriter(out);
            w.append(usid+"\t"+"$"+"\t"+pass+"%");
            w.close();
            out.close();
        }
        else
        {
            FileWriter out = new FileWriter(f);
            BufferedWriter w = new BufferedWriter(out);
            w.append(usid+"\t"+"$"+"\t"+pass+"%");
            w.close();
            out.close();
        }
        String temp=usid+".txt";
        FileWriter fout = new FileWriter(".\\"+temp,true);
        BufferedWriter bfw =new BufferedWriter(fout);
        bfw.write(ftnm+"%");
        bfw.append(ltnm+"%");
        bfw.append(gndr+"%");
        bfw.append(emid+"%");
        bfw.append(mbno+"%");
        bfw.append(adrs+"%");
        bfw.close();
        fout.close();
    }
    protected static boolean idchecking(String id,String pass) throws FileNotFoundException, IOException
    {
        File f=new File("\\Folder Location"+id+".txt");
        if(f.exists())
        {
            String ts="",temp="";
            FileInputStream fin=new FileInputStream(".\\fck.txt");
            int tc=fin.read();
            while(tc!=-1)
            {
                if((char)tc=='\t')
                {
                    ts="";int b=fin.read();
                    while(b!=37)
                    {b=fin.read();}
                    tc=fin.read();
                }
                ts+=((char)tc);
                tc=fin.read();
                if(ts.equals(id) && ((char)tc=='\t'))
                {
                    int b=fin.read();b=fin.read();
                    while((b=(char)fin.read())!='%')
                    {temp+=((char)b);}
                    break;
                }
            }
            fin.close();
            if(pass.equals(temp)){return true;}
            else{return false;}
        }
        return false;
    }
    public static void main(String[] args)
    {
        LoginForm lgf=new LoginForm();
        lgf.setVisible(true);
    }    
}