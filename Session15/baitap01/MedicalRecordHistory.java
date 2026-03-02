package Session15.baitap01;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> history = new Stack<>();
    public void addHistory(EditAction editAction) {
        history.push(editAction);
        System.out.println("Đã thêm chỉnh sửa!");
    }
    public EditAction getLastHistory() {
        if(this.isEmpty()){
            System.out.println("Không có chỉnh sửa nào để lấy!");
            return null;
        }
        return history.peek();
    }
    public boolean isEmpty() {
        return history.isEmpty();
    }
    public EditAction undoEdit() {
        if (this.isEmpty()) {
            System.out.println("Không có chỉnh sửa nào để Undo");
            return null;
        }

        EditAction editAction = history.pop();
        System.out.println("Đã Undo: "+ editAction.getDescription());
        return editAction;
    }
    public void displayHistory() {
        if (this.isEmpty()) {
            System.out.println("Stack đang rỗng");
            return;
        }
        for (int i = history.size() - 1; i >= 0; i--) {
            EditAction editAction = history.get(i);
            System.out.println("Mô tả: "
                    + editAction.getDescription()
                    + " Thời gian: "
                    + editAction.getTime());
        }
    }

}
