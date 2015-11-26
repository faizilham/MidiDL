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
	 * Visit a parse tree produced by {@link MdlParser#channel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannel(@NotNull MdlParser.ChannelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#tempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempo(@NotNull MdlParser.TempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(@NotNull MdlParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#octave_up}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctave_up(@NotNull MdlParser.Octave_upContext ctx);
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
	 * Visit a parse tree produced by {@link MdlParser#octave_down}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctave_down(@NotNull MdlParser.Octave_downContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(@NotNull MdlParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#group_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_declaration(@NotNull MdlParser.Group_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#channel_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannel_declarations(@NotNull MdlParser.Channel_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#octave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctave(@NotNull MdlParser.OctaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#group_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_declarations(@NotNull MdlParser.Group_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(@NotNull MdlParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#shift_octave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_octave(@NotNull MdlParser.Shift_octaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#group_usage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_usage(@NotNull MdlParser.Group_usageContext ctx);
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
	 * Visit a parse tree produced by {@link MdlParser#channels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannels(@NotNull MdlParser.ChannelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#channel_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannel_declaration(@NotNull MdlParser.Channel_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MdlParser#playthrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaythrough(@NotNull MdlParser.PlaythroughContext ctx);
}