// automatically generated by the FlatBuffers compiler, do not modify

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Movie extends Table {
  public static Movie getRootAsMovie(ByteBuffer _bb) { return getRootAsMovie(_bb, new Movie()); }
  public static Movie getRootAsMovie(ByteBuffer _bb, Movie obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public static boolean MovieBufferHasIdentifier(ByteBuffer _bb) { return __has_identifier(_bb, "MOVI"); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Movie __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte mainCharacterType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table mainCharacter(Table obj) { int o = __offset(6); return o != 0 ? __union(obj, o) : null; }
  public byte charactersType(int j) { int o = __offset(8); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int charactersTypeLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer charactersTypeAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer charactersTypeInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public Table characters(Table obj, int j) { int o = __offset(10); return o != 0 ? __union(obj, __vector(o) + j * 4 - bb_pos) : null; }
  public int charactersLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }

  public static int createMovie(FlatBufferBuilder builder,
      byte main_character_type,
      int main_characterOffset,
      int characters_typeOffset,
      int charactersOffset) {
    builder.startObject(4);
    Movie.addCharacters(builder, charactersOffset);
    Movie.addCharactersType(builder, characters_typeOffset);
    Movie.addMainCharacter(builder, main_characterOffset);
    Movie.addMainCharacterType(builder, main_character_type);
    return Movie.endMovie(builder);
  }

  public static void startMovie(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addMainCharacterType(FlatBufferBuilder builder, byte mainCharacterType) { builder.addByte(0, mainCharacterType, 0); }
  public static void addMainCharacter(FlatBufferBuilder builder, int mainCharacterOffset) { builder.addOffset(1, mainCharacterOffset, 0); }
  public static void addCharactersType(FlatBufferBuilder builder, int charactersTypeOffset) { builder.addOffset(2, charactersTypeOffset, 0); }
  public static int createCharactersTypeVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startCharactersTypeVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addCharacters(FlatBufferBuilder builder, int charactersOffset) { builder.addOffset(3, charactersOffset, 0); }
  public static int createCharactersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startCharactersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endMovie(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishMovieBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset, "MOVI"); }
  public static void finishSizePrefixedMovieBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset, "MOVI"); }
}

