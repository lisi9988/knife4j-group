package com.zdw.demo.toolkit;

/**
 * 参数分组校验类
 *
 * @author Tomcat
 */
public class ValidGroup {

    private ValidGroup() {
    }

    public interface Login {
    }

    public interface Logout {
    }

    public interface List {
    }

    public interface Delete {
    }

    public interface Update {
    }

    public interface Create {
    }

    public interface Query {
    }

    public interface Status {
    }

    // knife4j 隐藏
    public interface HiddenLogin {
    }

    public interface HiddenLogout {
    }

    public interface HiddenList {
    }

    public interface HiddenDelete {
    }

    public interface HiddenUpdate {
    }

    public interface HiddenCreate {
    }

    public interface HiddenQuery {
    }

    public interface HiddenStatus {
    }
}
