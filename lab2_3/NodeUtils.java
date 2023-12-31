package lab2_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NodeUtils {
    public static List<String> printPath(Node node) {
        if (node != null) {
            List<String> result = new ArrayList<String>();
            result.add(node.getLabel());
            Node tmp;
            while ((tmp = node.getParent()) != null) {

                result.add(tmp.getLabel());
                node = tmp;
            }
            Collections.reverse(result);
            if(result.size()==1) {
                return null;
            }else return result;
        } else
            return new ArrayList<String>();
    }
}
