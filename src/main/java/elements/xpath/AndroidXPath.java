package elements.xpath;

import elements.AppElements;

public class AndroidXPath extends BaseXPath {
    public AndroidXPath() {
        dictionary.put(AppElements.HOME_PAGE, "//android.widget.TextView[@content-desc='Trang chủ']");
        dictionary.put(AppElements.LOGIN_PHONE, "//android.widget.EditText[@text=\"Số điện thoại\"]");
        dictionary.put(AppElements.LOGIN_PWD, "//android.widget.EditText[@text=\"Mật khẩu\"]");
        dictionary.put(AppElements.LOGIN_BUTTON, "//android.widget.Button[@content-desc=\"Đăng nhập\"]");
        dictionary.put(AppElements.LOGIN_TAB_CUSTOMER, "//android.view.View[@content-desc=\"Khách hàng\nTab 1 trong tổng số 2\"]");
        dictionary.put(AppElements.LOGIN_TAB_SALER, "//android.view.View[@content-desc=\"Nhân viên\nTab 2 trong tổng số 2\"]");
        
        
        dictionary.put(AppElements.MSG_CONNECTION_ERR, "//android.view.View[@content-desc=\"Lỗi kết nối\"]");
        dictionary.put(AppElements.ERR_BUTON_CONFIM, "//android.widget.Button[@content-desc=\"Đồng ý\"]");

        // Add more xpath here
    }
}