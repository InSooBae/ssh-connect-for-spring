package com.ssh.ssh;

import com.jcraft.jsch.JSchException;
import com.ssh.ssh.utils.SSHUtils;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ConnectSSH {

    private final SSHUtils ssh;

    public void connect() throws JSchException {
        ssh.connectSSH();

        ssh.getSSHResponse("ls -al");
    }
}
