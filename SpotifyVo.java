public class SpotifyVo {
    LaguVo head;
    LaguVo tail;

    public void add(String judulLagu, String penyanyi, int tahunRilis, int menit, int detik) {
        LaguVo newNode = new LaguVo(judulLagu, penyanyi, tahunRilis, menit, detik);     
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display() {
        LaguVo temp = head;
        int index = 1;
        System.out.println("||================================== LOL Playlist ==================================||");
        System.out.println("=====================================================================================");
        
        while (temp != null) {
            System.out.printf("\t%d | %s - %s (%d)\n\t   %d:%02d\n", 
                    index, temp.penyanyi, temp.judulLagu, temp.tahunRilis, temp.menit, temp.detik);
            System.out.println("=====================================================================================");
            temp = temp.next;
            index++;
        }
    }

    public void asc() {
        if (head == null) return; 
        long startTime = System.nanoTime();  
    
        boolean swapped;
        do {
            swapped = false;
            LaguVo temp = head;
            LaguVo temp1 = null;
    
            while (temp.next != null) {
                LaguVo ptr = temp.next;
                if (temp.menit > ptr.menit || (temp.menit == ptr.menit && temp.detik > ptr.detik)) {
                    if (temp == head) {
                        head = ptr;
                    } else {
                        temp1.next = ptr;
                    }
                    temp.next = ptr.next;
                    ptr.next = temp;
                    swapped = true;
                    temp1 = ptr;
                } else {
                    temp1 = temp;
                    temp = temp.next;
                }
            }
        } while (swapped);
    
        long endTime = System.nanoTime(); 
        long duration = endTime - startTime; 
        System.out.println("Waktu pengurutan ASC: " + duration + " nanodetik");
    }
    
    public void desc() {
        if (head == null) return;
        long startTime = System.nanoTime(); 
    
        boolean swapped;
        do {
            swapped = false;
            LaguVo temp = head;
            LaguVo temp1 = null;
    
            while (temp.next != null) {
                LaguVo ptr = temp.next;
    
                if (temp.tahunRilis < ptr.tahunRilis) {
                    if (temp == head) {
                        head = ptr;
                    } else {
                        temp1.next = ptr;
                    }
                    temp.next = ptr.next;
                    ptr.next = temp;
                    swapped = true;
                    temp1 = ptr;
                } else {
                    temp1 = temp;
                    temp = temp.next;
                }
            }
        } while (swapped);
    
        long endTime = System.nanoTime();  
        long duration = endTime - startTime; 
        System.out.println("Waktu pengurutan DESC: " + duration + " nanodetik");
    }    

    public void linearSearch(String judulLagu) {
        LaguVo temp = head;
        int index = 1;
        boolean found = false;
    
        System.out.println("||==================== Hasil Pencarian ====================||");
        while (temp != null) {
            if (temp.judulLagu.equalsIgnoreCase(judulLagu)) {
                System.out.printf("Lagu ditemukan di posisi ke- %d:\n", index);
                System.out.printf("\t%d | %s - %s (%d)\n\t   %d:%02d\n", 
                        index, temp.penyanyi, temp.judulLagu, temp.tahunRilis, temp.menit, temp.detik);
                System.out.println("===========================================================");
                found = true;
                break;  
            }
            temp = temp.next;
            index++;
        }
    
        if (!found) {
            System.out.println("Lagu dengan judul '" + judulLagu + "' tidak ditemukan.");
        }
    }
}
