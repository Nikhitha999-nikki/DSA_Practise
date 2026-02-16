class TrieNode{
    TrieNode[] children=new TrieNode[26];
    boolean isEnd=false;
}
class Trie{
    private TrieNode root;
    public Trie(){
        root=new TrieNode();
    }
    //insert nodes
    public void insert(String word){
        TrieNode cur=root;
        for(char ch:word.toCharArray()){
            int index=ch-'a';
            if(cur.children[index]==null){
                cur.children[index]=new TrieNode();
            }
            cur=cur.children[index];
        }
        cur.isEnd=true;
    }
    //search complete word
    public boolean search(String word){
        TrieNode node=findNode(word);
        return node != null && node.isEnd;
    }
    //checkPrefix
    public boolean startWith(String prefix)
    {
        return findNode(prefix)!=null;
    }
    //helper metjhod
    private TrieNode findNode(String word){
        TrieNode current=root;
        for(char ch: word.toCharArray()){
            int index=ch-'a';
            if(current.children[index]==null) return null;
            current=current.children[index];
        }
        return current;
    }
    public class Main{
        public static void main(String[] args){
            Trie trie=new Trie();
            trie.insert("apple");
            trie.insert("app");
            trie.insert("aplication");
            System.out.println(trie.search("apple")); //true
            System.out.println(trie.search("app")); //true
            System.out.println(trie.search("appl")); //false
            System.out.println(trie.startWith("app")); //true
            System.out.println(trie.startWith("bat")); //true
        } 
    }
}
