package No1323Maximum69Number;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// todo:: not finish
public class Maximum69NumberSolution {

    public int maximum69Number(int num) {
        int multi = 10;
        int time = 1;
        int sixTime = 0;
        int tmpNum = num;
        while (multi < num) {
            int x = num % multi;
            if (x % 6 == 0) {
                sixTime++;
            }
            num = (num - x);
            multi = multi * multi;
        }
//        num += 3*sixTime*10;
        return num;
    }

    public static void main(String[] args) {
        Maximum69NumberSolution maximum69NumberSolution = new Maximum69NumberSolution();
        maximum69NumberSolution.maximum69Number(9669);
    }


    public static class Depart {

        private Integer id;

        private Integer parentId;

        private String companyId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getParentId() {
            return parentId;
        }

        public void setParentId(Integer parentId) {
            this.parentId = parentId;
        }

        public String getCompanyId() {
            return companyId;
        }

        public void setCompanyId(String companyId) {
            this.companyId = companyId;
        }
    }

    public static class DepartNode {
        private Depart depart;

        private List<DepartNode> child;

        public Depart getDepart() {
            return depart;
        }

        public void setDepart(Depart depart) {
            this.depart = depart;
        }

        public List<DepartNode> getChild() {
            return child;
        }

        public void setChild(List<DepartNode> child) {
            this.child = child;
        }
    }

    public void getDepartTree(List<Depart> departList) {
        Depart topDepart = departList.stream().filter(e -> e.parentId == 0).findFirst().get();
        departList.remove(topDepart);
        getChildNode(topDepart.id, departList);
    }

    public List<DepartNode> getChildNode(Integer departId, List<Depart> departList) {
        if (departList == null || departList.size() == 0) {
            return null;
        }
        List<Depart> childDepart = departList.stream().filter(e -> e.parentId.equals(departId)).collect(Collectors.toList());
        departList.removeAll(childDepart);
        List<DepartNode> childDepartNodeList = new ArrayList<>();
        for (Depart depart : childDepart) {
            DepartNode departNode = new DepartNode();
            departNode.setChild(getChildNode(depart.getId(), departList));
            departNode.setDepart(depart);
            childDepartNodeList.add(departNode);
        }

        return childDepartNodeList;
    }

}
