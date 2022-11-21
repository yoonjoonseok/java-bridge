package bridge;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
    	InputView inputView = new InputView();
    	OutputView outputView = new OutputView();
		int bridgeSize = inputView.readBridgeSize();
		BridgeGame bridgeGame;

		BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
		BridgeMaker bridgeMaker = new BridgeMaker(bridgeRandomNumberGenerator);
		List<String> moving = bridgeMaker.makeBridge(bridgeSize);
			
		while(true) {
			bridgeGame = new BridgeGame();
			
			if(bridgeGame.move(moving))
				break;
			
			if(!bridgeGame.retry(inputView.readGameCommand()))
				break;
		}
		
		outputView.printResult(bridgeGame);
		return;
		
    }
}
