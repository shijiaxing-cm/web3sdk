package org.bcos.contract.tools;

/**
 * Created by mingzhenliu on 2018/3/6.
 */
public class ToolConf {
    private String systemProxyAddress;
    private String privKey;
    private String account;
    private String outPutpath;


    public String getSystemProxyAddress() {
        return systemProxyAddress;
    }

    public void setSystemProxyAddress(String systemProxyAddress) {
        this.systemProxyAddress = systemProxyAddress;
    }

    public String getPrivKey() {
		return privKey;
	}

	public void setPrivKey(String privKey) {
		this.privKey = privKey;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getOutPutpath() {
        return outPutpath;
    }

    public void setOutPutpath(String outPutpath) {
        this.outPutpath = outPutpath;
    }
}
