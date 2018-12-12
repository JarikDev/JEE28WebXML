package jsp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class InnerTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        MyTag myTag=(MyTag) findAncestorWithClass(this, MyTag.class);
        getJspContext().getOut().print(myTag.getName());
    }
}
