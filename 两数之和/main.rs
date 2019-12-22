fn main() {
    let ints: [i8; 10] = [2, 8, 11, 7, 15, 10, -1, 9, 0, -9];
    let target: i8 = 9;
    let ints_lenth: i8 = ints.len() as i8;

    let mut start_freq: i8 = 0;
    let end_freq: i8 = 0;
    loop {
        let mut index1: i8 = 0;
        let mut index2: i8 = 0;
        let start: i8 = start_freq;
        for index in start..ints_lenth {
            let num: i8 = ints[start as usize] + ints[index as usize];
            if num == target {
                index1 = start_freq;
                index2 = index;
            }
        }
        if index2 != end_freq {
            println!("{} : {}", &index1, &index2);
        }
        if (ints_lenth - 1) <= start_freq {
            break;
        }
        start_freq += 1;
    };
}
