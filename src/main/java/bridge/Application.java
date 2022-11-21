package bridge;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO: 프로그램 구현
		InputView inputView = new InputView();
		int bridgeSize = inputView.readBridgeSize();

		BridgeNumberGenerator bridgeNumberGenerator = null;
		BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);
		List<String> bridgeUD = bridgeMaker.makeBridge(bridgeSize);
		
		return;
	}
}
