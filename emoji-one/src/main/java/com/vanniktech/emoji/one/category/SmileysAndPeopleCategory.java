package com.vanniktech.emoji.one.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.one.R;
import com.vanniktech.emoji.one.EmojiOne;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class SmileysAndPeopleCategory implements EmojiCategory {
  private static final EmojiOne[] DATA = new EmojiOne[] {
    new EmojiOne(0x1F600, 30, 24),
    new EmojiOne(0x1F601, 30, 25),
    new EmojiOne(0x1F602, 30, 26),
    new EmojiOne(0x1F923, 38, 26),
    new EmojiOne(0x1F603, 30, 27),
    new EmojiOne(0x1F604, 30, 28),
    new EmojiOne(0x1F605, 30, 29),
    new EmojiOne(0x1F606, 30, 30),
    new EmojiOne(0x1F609, 30, 33),
    new EmojiOne(0x1F60A, 30, 34),
    new EmojiOne(0x1F60B, 30, 35),
    new EmojiOne(0x1F60E, 30, 38),
    new EmojiOne(0x1F60D, 30, 37),
    new EmojiOne(0x1F618, 30, 48),
    new EmojiOne(0x1F617, 30, 47),
    new EmojiOne(0x1F619, 30, 49),
    new EmojiOne(0x1F61A, 30, 50),
    new EmojiOne(0x1F642, 31, 38),
    new EmojiOne(0x1F917, 37, 31),
    new EmojiOne(0x1F914, 37, 28),
    new EmojiOne(0x1F610, 30, 40),
    new EmojiOne(0x1F611, 30, 41),
    new EmojiOne(0x1F636, 31, 26),
    new EmojiOne(0x1F644, 31, 40),
    new EmojiOne(0x1F60F, 30, 39),
    new EmojiOne(0x1F623, 31, 7),
    new EmojiOne(0x1F625, 31, 9),
    new EmojiOne(0x1F62E, 31, 18),
    new EmojiOne(0x1F910, 37, 24),
    new EmojiOne(0x1F62F, 31, 19),
    new EmojiOne(0x1F62A, 31, 14),
    new EmojiOne(0x1F62B, 31, 15),
    new EmojiOne(0x1F634, 31, 24),
    new EmojiOne(0x1F60C, 30, 36),
    new EmojiOne(0x1F61B, 30, 51),
    new EmojiOne(0x1F61C, 31, 0),
    new EmojiOne(0x1F61D, 31, 1),
    new EmojiOne(0x1F924, 38, 27),
    new EmojiOne(0x1F612, 30, 42),
    new EmojiOne(0x1F613, 30, 43),
    new EmojiOne(0x1F614, 30, 44),
    new EmojiOne(0x1F615, 30, 45),
    new EmojiOne(0x1F643, 31, 39),
    new EmojiOne(0x1F911, 37, 25),
    new EmojiOne(0x1F632, 31, 22),
    new EmojiOne(0x1F641, 31, 37),
    new EmojiOne(0x1F616, 30, 46),
    new EmojiOne(0x1F61E, 31, 2),
    new EmojiOne(0x1F61F, 31, 3),
    new EmojiOne(0x1F624, 31, 8),
    new EmojiOne(0x1F622, 31, 6),
    new EmojiOne(0x1F62D, 31, 17),
    new EmojiOne(0x1F626, 31, 10),
    new EmojiOne(0x1F627, 31, 11),
    new EmojiOne(0x1F628, 31, 12),
    new EmojiOne(0x1F629, 31, 13),
    new EmojiOne(0x1F62C, 31, 16),
    new EmojiOne(0x1F630, 31, 20),
    new EmojiOne(0x1F631, 31, 21),
    new EmojiOne(0x1F633, 31, 23),
    new EmojiOne(0x1F635, 31, 25),
    new EmojiOne(0x1F621, 31, 5),
    new EmojiOne(0x1F620, 31, 4),
    new EmojiOne(0x1F637, 31, 27),
    new EmojiOne(0x1F912, 37, 26),
    new EmojiOne(0x1F915, 37, 29),
    new EmojiOne(0x1F922, 38, 25),
    new EmojiOne(0x1F927, 38, 47),
    new EmojiOne(0x1F607, 30, 31),
    new EmojiOne(0x1F920, 38, 23),
    new EmojiOne(0x1F921, 38, 24),
    new EmojiOne(0x1F925, 38, 28),
    new EmojiOne(0x1F913, 37, 27),
    new EmojiOne(0x1F608, 30, 32),
    new EmojiOne(0x1F47F, 22, 51),
    new EmojiOne(0x1F479, 22, 40),
    new EmojiOne(0x1F47A, 22, 41),
    new EmojiOne(0x1F480, 23, 0),
    new EmojiOne(0x1F47B, 22, 42),
    new EmojiOne(0x1F47D, 22, 49),
    new EmojiOne(0x1F47E, 22, 50),
    new EmojiOne(0x1F916, 37, 30),
    new EmojiOne(0x1F4A9, 25, 15),
    new EmojiOne(0x1F63A, 31, 30),
    new EmojiOne(0x1F638, 31, 28),
    new EmojiOne(0x1F639, 31, 29),
    new EmojiOne(0x1F63B, 31, 31),
    new EmojiOne(0x1F63C, 31, 32),
    new EmojiOne(0x1F63D, 31, 33),
    new EmojiOne(0x1F640, 31, 36),
    new EmojiOne(0x1F63F, 31, 35),
    new EmojiOne(0x1F63E, 31, 34),
    new EmojiOne(0x1F648, 32, 43),
    new EmojiOne(0x1F649, 32, 44),
    new EmojiOne(0x1F64A, 32, 45),
    new EmojiOne(0x1F476, 22, 10,
      new EmojiOne(new int[] { 0x1F476, 0x1F3FB }, 22, 11),
      new EmojiOne(new int[] { 0x1F476, 0x1F3FC }, 22, 12),
      new EmojiOne(new int[] { 0x1F476, 0x1F3FD }, 22, 13),
      new EmojiOne(new int[] { 0x1F476, 0x1F3FE }, 22, 14),
      new EmojiOne(new int[] { 0x1F476, 0x1F3FF }, 22, 15)
    ),
    new EmojiOne(0x1F466, 15, 42,
      new EmojiOne(new int[] { 0x1F466, 0x1F3FB }, 15, 43),
      new EmojiOne(new int[] { 0x1F466, 0x1F3FC }, 15, 44),
      new EmojiOne(new int[] { 0x1F466, 0x1F3FD }, 15, 45),
      new EmojiOne(new int[] { 0x1F466, 0x1F3FE }, 15, 46),
      new EmojiOne(new int[] { 0x1F466, 0x1F3FF }, 15, 47)
    ),
    new EmojiOne(0x1F467, 15, 48,
      new EmojiOne(new int[] { 0x1F467, 0x1F3FB }, 15, 49),
      new EmojiOne(new int[] { 0x1F467, 0x1F3FC }, 15, 50),
      new EmojiOne(new int[] { 0x1F467, 0x1F3FD }, 15, 51),
      new EmojiOne(new int[] { 0x1F467, 0x1F3FE }, 16, 0),
      new EmojiOne(new int[] { 0x1F467, 0x1F3FF }, 16, 1)
    ),
    new EmojiOne(0x1F468, 18, 11,
      new EmojiOne(new int[] { 0x1F468, 0x1F3FB }, 18, 12),
      new EmojiOne(new int[] { 0x1F468, 0x1F3FC }, 18, 13),
      new EmojiOne(new int[] { 0x1F468, 0x1F3FD }, 18, 14),
      new EmojiOne(new int[] { 0x1F468, 0x1F3FE }, 18, 15),
      new EmojiOne(new int[] { 0x1F468, 0x1F3FF }, 18, 16)
    ),
    new EmojiOne(0x1F469, 20, 23,
      new EmojiOne(new int[] { 0x1F469, 0x1F3FB }, 20, 24),
      new EmojiOne(new int[] { 0x1F469, 0x1F3FC }, 20, 25),
      new EmojiOne(new int[] { 0x1F469, 0x1F3FD }, 20, 26),
      new EmojiOne(new int[] { 0x1F469, 0x1F3FE }, 20, 27),
      new EmojiOne(new int[] { 0x1F469, 0x1F3FF }, 20, 28)
    ),
    new EmojiOne(0x1F474, 21, 50,
      new EmojiOne(new int[] { 0x1F474, 0x1F3FB }, 21, 51),
      new EmojiOne(new int[] { 0x1F474, 0x1F3FC }, 22, 0),
      new EmojiOne(new int[] { 0x1F474, 0x1F3FD }, 22, 1),
      new EmojiOne(new int[] { 0x1F474, 0x1F3FE }, 22, 2),
      new EmojiOne(new int[] { 0x1F474, 0x1F3FF }, 22, 3)
    ),
    new EmojiOne(0x1F475, 22, 4,
      new EmojiOne(new int[] { 0x1F475, 0x1F3FB }, 22, 5),
      new EmojiOne(new int[] { 0x1F475, 0x1F3FC }, 22, 6),
      new EmojiOne(new int[] { 0x1F475, 0x1F3FD }, 22, 7),
      new EmojiOne(new int[] { 0x1F475, 0x1F3FE }, 22, 8),
      new EmojiOne(new int[] { 0x1F475, 0x1F3FF }, 22, 9)
    ),
    new EmojiOne(0x1F934, 39, 28,
      new EmojiOne(new int[] { 0x1F934, 0x1F3FB }, 39, 29),
      new EmojiOne(new int[] { 0x1F934, 0x1F3FC }, 39, 30),
      new EmojiOne(new int[] { 0x1F934, 0x1F3FD }, 39, 31),
      new EmojiOne(new int[] { 0x1F934, 0x1F3FE }, 39, 32),
      new EmojiOne(new int[] { 0x1F934, 0x1F3FF }, 39, 33)
    ),
    new EmojiOne(0x1F478, 22, 34,
      new EmojiOne(new int[] { 0x1F478, 0x1F3FB }, 22, 35),
      new EmojiOne(new int[] { 0x1F478, 0x1F3FC }, 22, 36),
      new EmojiOne(new int[] { 0x1F478, 0x1F3FD }, 22, 37),
      new EmojiOne(new int[] { 0x1F478, 0x1F3FE }, 22, 38),
      new EmojiOne(new int[] { 0x1F478, 0x1F3FF }, 22, 39)
    ),
    new EmojiOne(0x1F472, 21, 26,
      new EmojiOne(new int[] { 0x1F472, 0x1F3FB }, 21, 27),
      new EmojiOne(new int[] { 0x1F472, 0x1F3FC }, 21, 28),
      new EmojiOne(new int[] { 0x1F472, 0x1F3FD }, 21, 29),
      new EmojiOne(new int[] { 0x1F472, 0x1F3FE }, 21, 30),
      new EmojiOne(new int[] { 0x1F472, 0x1F3FF }, 21, 31)
    ),
    new EmojiOne(0x1F935, 39, 34,
      new EmojiOne(new int[] { 0x1F935, 0x1F3FB }, 39, 35),
      new EmojiOne(new int[] { 0x1F935, 0x1F3FC }, 39, 36),
      new EmojiOne(new int[] { 0x1F935, 0x1F3FD }, 39, 37),
      new EmojiOne(new int[] { 0x1F935, 0x1F3FE }, 39, 38),
      new EmojiOne(new int[] { 0x1F935, 0x1F3FF }, 39, 39)
    ),
    new EmojiOne(0x1F470, 21, 2,
      new EmojiOne(new int[] { 0x1F470, 0x1F3FB }, 21, 3),
      new EmojiOne(new int[] { 0x1F470, 0x1F3FC }, 21, 4),
      new EmojiOne(new int[] { 0x1F470, 0x1F3FD }, 21, 5),
      new EmojiOne(new int[] { 0x1F470, 0x1F3FE }, 21, 6),
      new EmojiOne(new int[] { 0x1F470, 0x1F3FF }, 21, 7)
    ),
    new EmojiOne(0x1F930, 39, 4,
      new EmojiOne(new int[] { 0x1F930, 0x1F3FB }, 39, 5),
      new EmojiOne(new int[] { 0x1F930, 0x1F3FC }, 39, 6),
      new EmojiOne(new int[] { 0x1F930, 0x1F3FD }, 39, 7),
      new EmojiOne(new int[] { 0x1F930, 0x1F3FE }, 39, 8),
      new EmojiOne(new int[] { 0x1F930, 0x1F3FF }, 39, 9)
    ),
    new EmojiOne(0x1F47C, 22, 43,
      new EmojiOne(new int[] { 0x1F47C, 0x1F3FB }, 22, 44),
      new EmojiOne(new int[] { 0x1F47C, 0x1F3FC }, 22, 45),
      new EmojiOne(new int[] { 0x1F47C, 0x1F3FD }, 22, 46),
      new EmojiOne(new int[] { 0x1F47C, 0x1F3FE }, 22, 47),
      new EmojiOne(new int[] { 0x1F47C, 0x1F3FF }, 22, 48)
    ),
    new EmojiOne(0x1F385, 8, 19,
      new EmojiOne(new int[] { 0x1F385, 0x1F3FB }, 8, 20),
      new EmojiOne(new int[] { 0x1F385, 0x1F3FC }, 8, 21),
      new EmojiOne(new int[] { 0x1F385, 0x1F3FD }, 8, 22),
      new EmojiOne(new int[] { 0x1F385, 0x1F3FE }, 8, 23),
      new EmojiOne(new int[] { 0x1F385, 0x1F3FF }, 8, 24)
    ),
    new EmojiOne(0x1F936, 39, 40,
      new EmojiOne(new int[] { 0x1F936, 0x1F3FB }, 39, 41),
      new EmojiOne(new int[] { 0x1F936, 0x1F3FC }, 39, 42),
      new EmojiOne(new int[] { 0x1F936, 0x1F3FD }, 39, 43),
      new EmojiOne(new int[] { 0x1F936, 0x1F3FE }, 39, 44),
      new EmojiOne(new int[] { 0x1F936, 0x1F3FF }, 39, 45)
    ),
    new EmojiOne(0x1F483, 23, 37,
      new EmojiOne(new int[] { 0x1F483, 0x1F3FB }, 23, 38),
      new EmojiOne(new int[] { 0x1F483, 0x1F3FC }, 23, 39),
      new EmojiOne(new int[] { 0x1F483, 0x1F3FD }, 23, 40),
      new EmojiOne(new int[] { 0x1F483, 0x1F3FE }, 23, 41),
      new EmojiOne(new int[] { 0x1F483, 0x1F3FF }, 23, 42)
    ),
    new EmojiOne(0x1F57A, 29, 21,
      new EmojiOne(new int[] { 0x1F57A, 0x1F3FB }, 29, 22),
      new EmojiOne(new int[] { 0x1F57A, 0x1F3FC }, 29, 23),
      new EmojiOne(new int[] { 0x1F57A, 0x1F3FD }, 29, 24),
      new EmojiOne(new int[] { 0x1F57A, 0x1F3FE }, 29, 25),
      new EmojiOne(new int[] { 0x1F57A, 0x1F3FF }, 29, 26)
    ),
    new EmojiOne(0x1F6C0, 36, 36,
      new EmojiOne(new int[] { 0x1F6C0, 0x1F3FB }, 36, 37),
      new EmojiOne(new int[] { 0x1F6C0, 0x1F3FC }, 36, 38),
      new EmojiOne(new int[] { 0x1F6C0, 0x1F3FD }, 36, 39),
      new EmojiOne(new int[] { 0x1F6C0, 0x1F3FE }, 36, 40),
      new EmojiOne(new int[] { 0x1F6C0, 0x1F3FF }, 36, 41)
    ),
    new EmojiOne(0x1F6CC, 36, 48),
    new EmojiOne(0x1F464, 15, 40),
    new EmojiOne(0x1F465, 15, 41),
    new EmojiOne(0x1F93A, 40, 48),
    new EmojiOne(0x1F3C7, 10, 20,
      new EmojiOne(new int[] { 0x1F3C7, 0x1F3FB }, 10, 21),
      new EmojiOne(new int[] { 0x1F3C7, 0x1F3FC }, 10, 22),
      new EmojiOne(new int[] { 0x1F3C7, 0x1F3FD }, 10, 23),
      new EmojiOne(new int[] { 0x1F3C7, 0x1F3FE }, 10, 24),
      new EmojiOne(new int[] { 0x1F3C7, 0x1F3FF }, 10, 25)
    ),
    new EmojiOne(0x1F3C2, 9, 28),
    new EmojiOne(0x1F46B, 20, 30),
    new EmojiOne(0x1F46C, 20, 31),
    new EmojiOne(0x1F46D, 20, 32),
    new EmojiOne(new int[] { 0x1F468, 0x200D, 0x1F469, 0x200D, 0x1F467 }, 17, 4),
    new EmojiOne(new int[] { 0x1F468, 0x200D, 0x1F469, 0x200D, 0x1F467, 0x200D, 0x1F466 }, 17, 5),
    new EmojiOne(new int[] { 0x1F468, 0x200D, 0x1F469, 0x200D, 0x1F466, 0x200D, 0x1F466 }, 17, 3),
    new EmojiOne(new int[] { 0x1F468, 0x200D, 0x1F469, 0x200D, 0x1F467, 0x200D, 0x1F467 }, 17, 6),
    new EmojiOne(new int[] { 0x1F468, 0x200D, 0x1F468, 0x200D, 0x1F466 }, 16, 49),
    new EmojiOne(new int[] { 0x1F468, 0x200D, 0x1F468, 0x200D, 0x1F467 }, 16, 51),
    new EmojiOne(new int[] { 0x1F468, 0x200D, 0x1F468, 0x200D, 0x1F467, 0x200D, 0x1F466 }, 17, 0),
    new EmojiOne(new int[] { 0x1F468, 0x200D, 0x1F468, 0x200D, 0x1F466, 0x200D, 0x1F466 }, 16, 50),
    new EmojiOne(new int[] { 0x1F468, 0x200D, 0x1F468, 0x200D, 0x1F467, 0x200D, 0x1F467 }, 17, 1),
    new EmojiOne(new int[] { 0x1F469, 0x200D, 0x1F469, 0x200D, 0x1F466 }, 19, 12),
    new EmojiOne(new int[] { 0x1F469, 0x200D, 0x1F469, 0x200D, 0x1F467 }, 19, 14),
    new EmojiOne(new int[] { 0x1F469, 0x200D, 0x1F469, 0x200D, 0x1F467, 0x200D, 0x1F466 }, 19, 15),
    new EmojiOne(new int[] { 0x1F469, 0x200D, 0x1F469, 0x200D, 0x1F466, 0x200D, 0x1F466 }, 19, 13),
    new EmojiOne(new int[] { 0x1F469, 0x200D, 0x1F469, 0x200D, 0x1F467, 0x200D, 0x1F467 }, 19, 16),
    new EmojiOne(0x1F933, 39, 22,
      new EmojiOne(new int[] { 0x1F933, 0x1F3FB }, 39, 23),
      new EmojiOne(new int[] { 0x1F933, 0x1F3FC }, 39, 24),
      new EmojiOne(new int[] { 0x1F933, 0x1F3FD }, 39, 25),
      new EmojiOne(new int[] { 0x1F933, 0x1F3FE }, 39, 26),
      new EmojiOne(new int[] { 0x1F933, 0x1F3FF }, 39, 27)
    ),
    new EmojiOne(0x1F4AA, 25, 16,
      new EmojiOne(new int[] { 0x1F4AA, 0x1F3FB }, 25, 17),
      new EmojiOne(new int[] { 0x1F4AA, 0x1F3FC }, 25, 18),
      new EmojiOne(new int[] { 0x1F4AA, 0x1F3FD }, 25, 19),
      new EmojiOne(new int[] { 0x1F4AA, 0x1F3FE }, 25, 20),
      new EmojiOne(new int[] { 0x1F4AA, 0x1F3FF }, 25, 21)
    ),
    new EmojiOne(0x1F448, 14, 19,
      new EmojiOne(new int[] { 0x1F448, 0x1F3FB }, 14, 20),
      new EmojiOne(new int[] { 0x1F448, 0x1F3FC }, 14, 21),
      new EmojiOne(new int[] { 0x1F448, 0x1F3FD }, 14, 22),
      new EmojiOne(new int[] { 0x1F448, 0x1F3FE }, 14, 23),
      new EmojiOne(new int[] { 0x1F448, 0x1F3FF }, 14, 24)
    ),
    new EmojiOne(0x1F449, 14, 25,
      new EmojiOne(new int[] { 0x1F449, 0x1F3FB }, 14, 26),
      new EmojiOne(new int[] { 0x1F449, 0x1F3FC }, 14, 27),
      new EmojiOne(new int[] { 0x1F449, 0x1F3FD }, 14, 28),
      new EmojiOne(new int[] { 0x1F449, 0x1F3FE }, 14, 29),
      new EmojiOne(new int[] { 0x1F449, 0x1F3FF }, 14, 30)
    ),
    new EmojiOne(0x1F446, 14, 7,
      new EmojiOne(new int[] { 0x1F446, 0x1F3FB }, 14, 8),
      new EmojiOne(new int[] { 0x1F446, 0x1F3FC }, 14, 9),
      new EmojiOne(new int[] { 0x1F446, 0x1F3FD }, 14, 10),
      new EmojiOne(new int[] { 0x1F446, 0x1F3FE }, 14, 11),
      new EmojiOne(new int[] { 0x1F446, 0x1F3FF }, 14, 12)
    ),
    new EmojiOne(0x1F595, 29, 38,
      new EmojiOne(new int[] { 0x1F595, 0x1F3FB }, 29, 39),
      new EmojiOne(new int[] { 0x1F595, 0x1F3FC }, 29, 40),
      new EmojiOne(new int[] { 0x1F595, 0x1F3FD }, 29, 41),
      new EmojiOne(new int[] { 0x1F595, 0x1F3FE }, 29, 42),
      new EmojiOne(new int[] { 0x1F595, 0x1F3FF }, 29, 43)
    ),
    new EmojiOne(0x1F447, 14, 13,
      new EmojiOne(new int[] { 0x1F447, 0x1F3FB }, 14, 14),
      new EmojiOne(new int[] { 0x1F447, 0x1F3FC }, 14, 15),
      new EmojiOne(new int[] { 0x1F447, 0x1F3FD }, 14, 16),
      new EmojiOne(new int[] { 0x1F447, 0x1F3FE }, 14, 17),
      new EmojiOne(new int[] { 0x1F447, 0x1F3FF }, 14, 18)
    ),
    new EmojiOne(0x1F91E, 38, 11,
      new EmojiOne(new int[] { 0x1F91E, 0x1F3FB }, 38, 12),
      new EmojiOne(new int[] { 0x1F91E, 0x1F3FC }, 38, 13),
      new EmojiOne(new int[] { 0x1F91E, 0x1F3FD }, 38, 14),
      new EmojiOne(new int[] { 0x1F91E, 0x1F3FE }, 38, 15),
      new EmojiOne(new int[] { 0x1F91E, 0x1F3FF }, 38, 16)
    ),
    new EmojiOne(0x1F596, 29, 44,
      new EmojiOne(new int[] { 0x1F596, 0x1F3FB }, 29, 45),
      new EmojiOne(new int[] { 0x1F596, 0x1F3FC }, 29, 46),
      new EmojiOne(new int[] { 0x1F596, 0x1F3FD }, 29, 47),
      new EmojiOne(new int[] { 0x1F596, 0x1F3FE }, 29, 48),
      new EmojiOne(new int[] { 0x1F596, 0x1F3FF }, 29, 49)
    ),
    new EmojiOne(0x1F918, 37, 32,
      new EmojiOne(new int[] { 0x1F918, 0x1F3FB }, 37, 33),
      new EmojiOne(new int[] { 0x1F918, 0x1F3FC }, 37, 34),
      new EmojiOne(new int[] { 0x1F918, 0x1F3FD }, 37, 35),
      new EmojiOne(new int[] { 0x1F918, 0x1F3FE }, 37, 36),
      new EmojiOne(new int[] { 0x1F918, 0x1F3FF }, 37, 37)
    ),
    new EmojiOne(0x1F919, 37, 38,
      new EmojiOne(new int[] { 0x1F919, 0x1F3FB }, 37, 39),
      new EmojiOne(new int[] { 0x1F919, 0x1F3FC }, 37, 40),
      new EmojiOne(new int[] { 0x1F919, 0x1F3FD }, 37, 41),
      new EmojiOne(new int[] { 0x1F919, 0x1F3FE }, 37, 42),
      new EmojiOne(new int[] { 0x1F919, 0x1F3FF }, 37, 43)
    ),
    new EmojiOne(0x270B, 49, 24,
      new EmojiOne(new int[] { 0x270B, 0x1F3FB }, 49, 25),
      new EmojiOne(new int[] { 0x270B, 0x1F3FC }, 49, 26),
      new EmojiOne(new int[] { 0x270B, 0x1F3FD }, 49, 27),
      new EmojiOne(new int[] { 0x270B, 0x1F3FE }, 49, 28),
      new EmojiOne(new int[] { 0x270B, 0x1F3FF }, 49, 29)
    ),
    new EmojiOne(0x1F44C, 14, 43,
      new EmojiOne(new int[] { 0x1F44C, 0x1F3FB }, 14, 44),
      new EmojiOne(new int[] { 0x1F44C, 0x1F3FC }, 14, 45),
      new EmojiOne(new int[] { 0x1F44C, 0x1F3FD }, 14, 46),
      new EmojiOne(new int[] { 0x1F44C, 0x1F3FE }, 14, 47),
      new EmojiOne(new int[] { 0x1F44C, 0x1F3FF }, 14, 48)
    ),
    new EmojiOne(0x1F44D, 14, 49,
      new EmojiOne(new int[] { 0x1F44D, 0x1F3FB }, 14, 50),
      new EmojiOne(new int[] { 0x1F44D, 0x1F3FC }, 14, 51),
      new EmojiOne(new int[] { 0x1F44D, 0x1F3FD }, 15, 0),
      new EmojiOne(new int[] { 0x1F44D, 0x1F3FE }, 15, 1),
      new EmojiOne(new int[] { 0x1F44D, 0x1F3FF }, 15, 2)
    ),
    new EmojiOne(0x1F44E, 15, 3,
      new EmojiOne(new int[] { 0x1F44E, 0x1F3FB }, 15, 4),
      new EmojiOne(new int[] { 0x1F44E, 0x1F3FC }, 15, 5),
      new EmojiOne(new int[] { 0x1F44E, 0x1F3FD }, 15, 6),
      new EmojiOne(new int[] { 0x1F44E, 0x1F3FE }, 15, 7),
      new EmojiOne(new int[] { 0x1F44E, 0x1F3FF }, 15, 8)
    ),
    new EmojiOne(0x270A, 49, 18,
      new EmojiOne(new int[] { 0x270A, 0x1F3FB }, 49, 19),
      new EmojiOne(new int[] { 0x270A, 0x1F3FC }, 49, 20),
      new EmojiOne(new int[] { 0x270A, 0x1F3FD }, 49, 21),
      new EmojiOne(new int[] { 0x270A, 0x1F3FE }, 49, 22),
      new EmojiOne(new int[] { 0x270A, 0x1F3FF }, 49, 23)
    ),
    new EmojiOne(0x1F44A, 14, 31,
      new EmojiOne(new int[] { 0x1F44A, 0x1F3FB }, 14, 32),
      new EmojiOne(new int[] { 0x1F44A, 0x1F3FC }, 14, 33),
      new EmojiOne(new int[] { 0x1F44A, 0x1F3FD }, 14, 34),
      new EmojiOne(new int[] { 0x1F44A, 0x1F3FE }, 14, 35),
      new EmojiOne(new int[] { 0x1F44A, 0x1F3FF }, 14, 36)
    ),
    new EmojiOne(0x1F91B, 37, 50,
      new EmojiOne(new int[] { 0x1F91B, 0x1F3FB }, 37, 51),
      new EmojiOne(new int[] { 0x1F91B, 0x1F3FC }, 38, 0),
      new EmojiOne(new int[] { 0x1F91B, 0x1F3FD }, 38, 1),
      new EmojiOne(new int[] { 0x1F91B, 0x1F3FE }, 38, 2),
      new EmojiOne(new int[] { 0x1F91B, 0x1F3FF }, 38, 3)
    ),
    new EmojiOne(0x1F91C, 38, 4,
      new EmojiOne(new int[] { 0x1F91C, 0x1F3FB }, 38, 5),
      new EmojiOne(new int[] { 0x1F91C, 0x1F3FC }, 38, 6),
      new EmojiOne(new int[] { 0x1F91C, 0x1F3FD }, 38, 7),
      new EmojiOne(new int[] { 0x1F91C, 0x1F3FE }, 38, 8),
      new EmojiOne(new int[] { 0x1F91C, 0x1F3FF }, 38, 9)
    ),
    new EmojiOne(0x1F91A, 37, 44,
      new EmojiOne(new int[] { 0x1F91A, 0x1F3FB }, 37, 45),
      new EmojiOne(new int[] { 0x1F91A, 0x1F3FC }, 37, 46),
      new EmojiOne(new int[] { 0x1F91A, 0x1F3FD }, 37, 47),
      new EmojiOne(new int[] { 0x1F91A, 0x1F3FE }, 37, 48),
      new EmojiOne(new int[] { 0x1F91A, 0x1F3FF }, 37, 49)
    ),
    new EmojiOne(0x1F44B, 14, 37,
      new EmojiOne(new int[] { 0x1F44B, 0x1F3FB }, 14, 38),
      new EmojiOne(new int[] { 0x1F44B, 0x1F3FC }, 14, 39),
      new EmojiOne(new int[] { 0x1F44B, 0x1F3FD }, 14, 40),
      new EmojiOne(new int[] { 0x1F44B, 0x1F3FE }, 14, 41),
      new EmojiOne(new int[] { 0x1F44B, 0x1F3FF }, 14, 42)
    ),
    new EmojiOne(0x1F44F, 15, 9,
      new EmojiOne(new int[] { 0x1F44F, 0x1F3FB }, 15, 10),
      new EmojiOne(new int[] { 0x1F44F, 0x1F3FC }, 15, 11),
      new EmojiOne(new int[] { 0x1F44F, 0x1F3FD }, 15, 12),
      new EmojiOne(new int[] { 0x1F44F, 0x1F3FE }, 15, 13),
      new EmojiOne(new int[] { 0x1F44F, 0x1F3FF }, 15, 14)
    ),
    new EmojiOne(0x1F450, 15, 15,
      new EmojiOne(new int[] { 0x1F450, 0x1F3FB }, 15, 16),
      new EmojiOne(new int[] { 0x1F450, 0x1F3FC }, 15, 17),
      new EmojiOne(new int[] { 0x1F450, 0x1F3FD }, 15, 18),
      new EmojiOne(new int[] { 0x1F450, 0x1F3FE }, 15, 19),
      new EmojiOne(new int[] { 0x1F450, 0x1F3FF }, 15, 20)
    ),
    new EmojiOne(0x1F64C, 33, 12,
      new EmojiOne(new int[] { 0x1F64C, 0x1F3FB }, 33, 13),
      new EmojiOne(new int[] { 0x1F64C, 0x1F3FC }, 33, 14),
      new EmojiOne(new int[] { 0x1F64C, 0x1F3FD }, 33, 15),
      new EmojiOne(new int[] { 0x1F64C, 0x1F3FE }, 33, 16),
      new EmojiOne(new int[] { 0x1F64C, 0x1F3FF }, 33, 17)
    ),
    new EmojiOne(0x1F64F, 34, 2,
      new EmojiOne(new int[] { 0x1F64F, 0x1F3FB }, 34, 3),
      new EmojiOne(new int[] { 0x1F64F, 0x1F3FC }, 34, 4),
      new EmojiOne(new int[] { 0x1F64F, 0x1F3FD }, 34, 5),
      new EmojiOne(new int[] { 0x1F64F, 0x1F3FE }, 34, 6),
      new EmojiOne(new int[] { 0x1F64F, 0x1F3FF }, 34, 7)
    ),
    new EmojiOne(0x1F91D, 38, 10),
    new EmojiOne(0x1F485, 23, 44,
      new EmojiOne(new int[] { 0x1F485, 0x1F3FB }, 23, 45),
      new EmojiOne(new int[] { 0x1F485, 0x1F3FC }, 23, 46),
      new EmojiOne(new int[] { 0x1F485, 0x1F3FD }, 23, 47),
      new EmojiOne(new int[] { 0x1F485, 0x1F3FE }, 23, 48),
      new EmojiOne(new int[] { 0x1F485, 0x1F3FF }, 23, 49)
    ),
    new EmojiOne(0x1F442, 13, 45,
      new EmojiOne(new int[] { 0x1F442, 0x1F3FB }, 13, 46),
      new EmojiOne(new int[] { 0x1F442, 0x1F3FC }, 13, 47),
      new EmojiOne(new int[] { 0x1F442, 0x1F3FD }, 13, 48),
      new EmojiOne(new int[] { 0x1F442, 0x1F3FE }, 13, 49),
      new EmojiOne(new int[] { 0x1F442, 0x1F3FF }, 13, 50)
    ),
    new EmojiOne(0x1F443, 13, 51,
      new EmojiOne(new int[] { 0x1F443, 0x1F3FB }, 14, 0),
      new EmojiOne(new int[] { 0x1F443, 0x1F3FC }, 14, 1),
      new EmojiOne(new int[] { 0x1F443, 0x1F3FD }, 14, 2),
      new EmojiOne(new int[] { 0x1F443, 0x1F3FE }, 14, 3),
      new EmojiOne(new int[] { 0x1F443, 0x1F3FF }, 14, 4)
    ),
    new EmojiOne(0x1F463, 15, 39),
    new EmojiOne(0x1F440, 13, 42),
    new EmojiOne(0x1F445, 14, 6),
    new EmojiOne(0x1F444, 14, 5),
    new EmojiOne(0x1F48B, 24, 37),
    new EmojiOne(0x1F498, 24, 50),
    new EmojiOne(0x1F493, 24, 45),
    new EmojiOne(0x1F494, 24, 46),
    new EmojiOne(0x1F495, 24, 47),
    new EmojiOne(0x1F496, 24, 48),
    new EmojiOne(0x1F497, 24, 49),
    new EmojiOne(0x1F499, 24, 51),
    new EmojiOne(0x1F49A, 25, 0),
    new EmojiOne(0x1F49B, 25, 1),
    new EmojiOne(0x1F49C, 25, 2),
    new EmojiOne(0x1F5A4, 29, 50),
    new EmojiOne(0x1F49D, 25, 3),
    new EmojiOne(0x1F49E, 25, 4),
    new EmojiOne(0x1F49F, 25, 5),
    new EmojiOne(0x1F48C, 24, 38),
    new EmojiOne(0x1F4A4, 25, 10),
    new EmojiOne(0x1F4A2, 25, 8),
    new EmojiOne(0x1F4A3, 25, 9),
    new EmojiOne(0x1F4A5, 25, 11),
    new EmojiOne(0x1F4A6, 25, 12),
    new EmojiOne(0x1F4A8, 25, 14),
    new EmojiOne(0x1F4AB, 25, 22),
    new EmojiOne(0x1F4AC, 25, 23),
    new EmojiOne(0x1F4AD, 25, 24),
    new EmojiOne(0x1F453, 15, 23),
    new EmojiOne(0x1F454, 15, 24),
    new EmojiOne(0x1F455, 15, 25),
    new EmojiOne(0x1F456, 15, 26),
    new EmojiOne(0x1F457, 15, 27),
    new EmojiOne(0x1F458, 15, 28),
    new EmojiOne(0x1F459, 15, 29),
    new EmojiOne(0x1F45A, 15, 30),
    new EmojiOne(0x1F45B, 15, 31),
    new EmojiOne(0x1F45C, 15, 32),
    new EmojiOne(0x1F45D, 15, 33),
    new EmojiOne(0x1F392, 8, 37),
    new EmojiOne(0x1F45E, 15, 34),
    new EmojiOne(0x1F45F, 15, 35),
    new EmojiOne(0x1F460, 15, 36),
    new EmojiOne(0x1F461, 15, 37),
    new EmojiOne(0x1F462, 15, 38),
    new EmojiOne(0x1F451, 15, 21),
    new EmojiOne(0x1F452, 15, 22),
    new EmojiOne(0x1F3A9, 9, 3),
    new EmojiOne(0x1F393, 8, 38),
    new EmojiOne(0x1F4FF, 27, 1),
    new EmojiOne(0x1F484, 23, 43),
    new EmojiOne(0x1F48D, 24, 39),
    new EmojiOne(0x1F48E, 24, 40)
  };

  @Override @NonNull public EmojiOne[] getEmojis() {
    return DATA;
  }

  @Override @DrawableRes public int getIcon() {
    return R.drawable.emoji_one_category_smileysandpeople;
  }
}