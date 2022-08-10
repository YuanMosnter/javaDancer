package arraylist;

import java.util.ArrayList;

/**
 * 项目名称：javaDacner
 * 类 名 称：DotCom
 * 类 描 述：TODO
 * 创建时间：2022/8/10 23:41
 * 创 建 人：wesson
 */
public class DotCom {
    private ArrayList<String> locationCells;

    /**
     * 设置一个arraylist数组
     * @param locationCells
     */
    public DotCom(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }
    public String checkYourself(String userInput){
        //
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index>=0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result = "kill";
            }else {
                result = "hit";
            }
        }
        return result;
    }
}
