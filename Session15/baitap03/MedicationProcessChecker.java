package Session15.baitap03;

import java.util.Stack;

class MedicationProcessChecker {

    private Stack<String> stack = new Stack<>();
    public void reset() {
        stack.clear();
    }
    public boolean checkProcess(String[] actions) {
        reset();
        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];
            if (action.equals("PUSH")) {
                stack.push("Medication");
                System.out.println("Bước " + (i + 1) + ": PUSH (Phát thuốc)");

            } else if (action.equals("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Lỗi tại bước " + (i + 1)
                            + ": POP khi stack đang rỗng!");
                    return false;
                }

                stack.pop();
                System.out.println("Bước " + (i + 1) + ": POP (Hoàn tất)");

            } else {
                System.out.println("Hành động không hợp lệ: " + action);
                return false;
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Kết thúc nhưng còn "
                    + stack.size() + " thuốc chưa hoàn tất!");
            return false;
        }

        System.out.println("Quy trình hợp lệ!");
        return true;
    }
    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();

        System.out.println("=== CASE 1: HỢP LỆ ===");
        String[] case1 = {"PUSH", "PUSH", "POP", "POP"};
        checker.checkProcess(case1);

        System.out.println("\n=== CASE 2: POP KHI RỖNG ===");
        String[] case2 = {"POP", "PUSH"};
        checker.checkProcess(case2);

        System.out.println("\n=== CASE 3: CÒN DƯ PUSH ===");
        String[] case3 = {"PUSH", "PUSH", "POP"};
        checker.checkProcess(case3);
    }
}