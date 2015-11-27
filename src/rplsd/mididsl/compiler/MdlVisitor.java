// Generated from Mdl.g4 by ANTLR 4.4
package rplsd.mididsl.compiler;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MdlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MdlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MdlParser#note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote(@NotNull MdlParser.NoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#harmony}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHarmony(@NotNull MdlParser.HarmonyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#tempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempo(@NotNull MdlParser.TempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull MdlParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(@NotNull MdlParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(@NotNull MdlParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#pitch_transpose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPitch_transpose(@NotNull MdlParser.Pitch_transposeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#tie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTie(@NotNull MdlParser.TieContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#midi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMidi(@NotNull MdlParser.MidiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(@NotNull MdlParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(@NotNull MdlParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull MdlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#playback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayback(@NotNull MdlParser.PlaybackContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#track_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrack_declaration(@NotNull MdlParser.Track_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#track}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrack(@NotNull MdlParser.TrackContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#shift_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_sign(@NotNull MdlParser.Shift_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(@NotNull MdlParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#octave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctave(@NotNull MdlParser.OctaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(@NotNull MdlParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(@NotNull MdlParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#volume}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVolume(@NotNull MdlParser.VolumeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#pitch_shift_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPitch_shift_sign(@NotNull MdlParser.Pitch_shift_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#length_shift_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength_shift_sign(@NotNull MdlParser.Length_shift_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#section_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection_declaration(@NotNull MdlParser.Section_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#percussion_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercussion_declaration(@NotNull MdlParser.Percussion_declarationContext ctx);
}