import java.util.ArrayList;

public class Main {

    ArrayList<Block> blockchain = new ArrayList<Block>();

    public static void main(String[] args) {

        String[] genesisTransactions = {"send 1000 bitcoins"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"send 10 bitcoin to satoshi"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        System.out.println("Hash of genesis block");
        System.out.println(genesisBlock.getBlockHash());
        System.out.println("Hash of block2:");
        System.out.println(block2.getBlockHash());

    }
}
