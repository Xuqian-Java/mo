package com.xuqian.mo.context;

/**
 * Created by xuqian on 04/07/17.
 */
public interface Command<S, R> {
    void execute(S session, R request) throws Exception;
}
