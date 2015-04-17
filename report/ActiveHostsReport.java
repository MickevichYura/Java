package report;

import java.util.List;
import java.util.Map;

public class ActiveHostsReport {

	public static final int numberOfHosts = 5;
	private List<Map.Entry<String, Integer>> hosts;

	public ActiveHostsReport(List<Map.Entry<String, Integer>> hosts) {
		super();
		this.hosts = hosts;
	}

	public List<Map.Entry<String, Integer>> getHosts() {
		return hosts;
	}

	public void setHosts(List<Map.Entry<String, Integer>> hosts) {
		this.hosts = hosts;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Object host : hosts) {
			sb.append(host.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}