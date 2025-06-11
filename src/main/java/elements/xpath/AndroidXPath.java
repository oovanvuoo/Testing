package elements.xpath;

import elements.AppElements;

public class AndroidXPath extends BaseXPath {
    public AndroidXPath() {
        dictionary.put(AppElements.HOME_PAGE, "//android.widget.TextView[@content-desc='Home']");
        dictionary.put(AppElements.RANK_PAGE, "//android.widget.TextView[@content-desc='Rank']");


        dictionary.put(AppElements.LOGIN_PHONE, "//android.widget.EditText[@text=\"Số điện thoại\"]");
        dictionary.put(AppElements.LOGIN_PWD, "//android.widget.EditText[@text=\"Mật khẩu\"]");
        dictionary.put(AppElements.LOGIN_BUTTON, "//android.widget.Button[@content-desc=\"Đăng nhập\"]");
        dictionary.put(AppElements.LOGIN_TAB_CUSTOMER, "//android.view.View[@content-desc=\"Khách hàng\n" + //
                        "Tab 1 trong tổng số 2\"]");
        dictionary.put(AppElements.LOGIN_TAB_SALER, "//android.view.View[@content-desc=\"Nhân viên\n" + //
                        "Tab 2 trong tổng số 2\"]");
        

        // Add more locators here
    }
}