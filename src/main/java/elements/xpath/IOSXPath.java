package elements.xpath;

import elements.AppElements;

public class IOSXPath extends BaseXPath {
    public IOSXPath() {
        dictionary.put(AppElements.HOME_PAGE, "//XCUIElementTypeStaticText[@name='Home']");
        dictionary.put(AppElements.RANK_PAGE, "//XCUIElementTypeStaticText[@name='Rank']");
        // Add more locators here...
    }
}
