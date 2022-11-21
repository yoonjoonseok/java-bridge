package bridge;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO: 프로그램 구현
		InputView inputView = new InputView();
		int bridgeSize = inputView.readBridgeSize();

		BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
		BridgeMaker bridgeMaker = new BridgeMaker(bridgeRandomNumberGenerator);
		List<String> bridgeUD = bridgeMaker.makeBridge(bridgeSize);
		
		return;
	}
}
