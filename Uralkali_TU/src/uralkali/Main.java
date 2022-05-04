package uralkali;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int parent_id;
        int comp;
        int pods_id;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("id фидера");
        parent_id = sc.nextInt();
        System.out.println("количество фидеров");
        comp = sc.nextInt();
        System.out.println("id подстанции");
        pods_id = sc.nextInt();

        for (int i = 2; i <= comp; i++) {
            parent_id = parent_id + 4;
            System.out.println("INSERT INTO [dbo].[Points]\n" +
                    "           ([PointName]\n" +
                    "           ,[ID_Parent]\n" +
                    "           ,[Point_Type]\n" +
                    "           ,[ID_Ref])\n" +
                    "     VALUES\n" +
                    "           ('КНС-13 Водоканал Т-1'\n" +
                    "," + pods_id +
                    "           ,10\n" +
                    "           ,null)\n" +
                    "\n" +
                    "INSERT INTO [dbo].[Points]\n" +
                    "           ([PointName]\n" +
                    "           ,[ID_Parent]\n" +
                    "           ,[Point_Type]\n" +
                    "           ,[ID_Ref])\n" +
                    "     VALUES\n" +
                    "           ('Счетчик'\n" +
                    "," + parent_id +
                    "           ,21\n" +
                    "           ,null)\n" +
                    "\n" +
                    "INSERT INTO [dbo].[Points]\n" +
                    "           ([PointName]\n" +
                    "           ,[ID_Parent]\n" +
                    "           ,[Point_Type]\n" +
                    "           ,[ID_Ref])\n" +
                    "     VALUES\n" +
                    "           ('ТН'\n" +
                    "," + parent_id +
                    "           ,85\n" +
                    "           ,null)\n" +
                    "\n" +
                    "INSERT INTO [dbo].[Points]\n" +
                    "           ([PointName]\n" +
                    "           ,[ID_Parent]\n" +
                    "           ,[Point_Type]\n" +
                    "           ,[ID_Ref])\n" +
                    "     VALUES\n" +
                    "           ('ТТ'\n" +
                    "," + parent_id +
                    "           ,81\n" +
                    "           ,null)");
        }


    }
}
