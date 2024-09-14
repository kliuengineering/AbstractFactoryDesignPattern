import java.util.Scanner;
import Tools.ToolIf;
import Tools.Toolbox;


public class ToolsTestMain
{
    public static void main(String[] args)
    {
        Toolbox toolbox = new Toolbox("Data Processing Support");
        ToolIf[] tools = new ToolIf[2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tools.length; i++)
        {
            ToolIf tool = Toolbox.createTool(scanner);
            boolean ret = toolbox.addTool(tool);

            if(!ret)
            {
                System.out.println("Unable to add tool!");
            }

            tools[i] = tool;
        }

        toolbox.display();
    }
}
